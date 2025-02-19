package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import clases.Curso;

public class CursoApp extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtCodigo;
    private JTextField txtAsignatura;
    private JTextField txtCreditos;
    private JTextField txtHoras;
    private JTable table;
    private List<Curso> cursos = new ArrayList<>();
    private DefaultTableModel model;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	CursoApp frame = new CursoApp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CursoApp() {
        setTitle("Curso");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 648, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(10, 11, 46, 14);
        contentPane.add(lblCodigo);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(141, 8, 100, 20);
        contentPane.add(txtCodigo);
        txtCodigo.setColumns(10);

        JLabel lblAsignatura = new JLabel("Asignatura:");
        lblAsignatura.setBounds(10, 36, 65, 14);
        contentPane.add(lblAsignatura);

        txtAsignatura = new JTextField();
        txtAsignatura.setBounds(141, 33, 200, 20);
        contentPane.add(txtAsignatura);
        txtAsignatura.setColumns(10);

        JLabel lblCiclo = new JLabel("Ciclo:");
        lblCiclo.setBounds(10, 61, 46, 14);
        contentPane.add(lblCiclo);

        JComboBox<String> cboCiclo = new JComboBox<>();
        cboCiclo.setModel(new DefaultComboBoxModel<>(new String[] {"Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto"}));
        cboCiclo.setBounds(141, 57, 100, 22);
        contentPane.add(cboCiclo);

        JLabel lblCreditos = new JLabel("Número de créditos:");
        lblCreditos.setBounds(10, 86, 121, 14);
        contentPane.add(lblCreditos);

        txtCreditos = new JTextField();
        txtCreditos.setBounds(141, 83, 65, 20);
        contentPane.add(txtCreditos);
        txtCreditos.setColumns(10);

        JLabel lblHoras = new JLabel("Cantidad de horas:");
        lblHoras.setBounds(10, 111, 121, 14);
        contentPane.add(lblHoras);

        txtHoras = new JTextField();
        txtHoras.setBounds(141, 108, 65, 20);
        contentPane.add(txtHoras);
        txtHoras.setColumns(10);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 136, 612, 364);
        contentPane.add(scrollPane);

        table = new JTable();
        model = new DefaultTableModel(
            new Object[][] {},
            new String[] {"Código", "Asignatura", "Ciclo", "Número de créditos", "Cantidad de horas"}
        );
        table.setModel(model);
        scrollPane.setViewportView(table);

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(533, 7, 89, 23);
        contentPane.add(btnAdicionar);

        JButton btnConsultar = new JButton("Consultar");
        btnConsultar.setBounds(533, 32, 89, 23);
        contentPane.add(btnConsultar);

        JButton btnModificar = new JButton("Modificar");
        btnModificar.setBounds(533, 57, 89, 23);
        contentPane.add(btnModificar);

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(533, 82, 89, 23);
        contentPane.add(btnEliminar);

        // Adicionar Curso
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(txtCodigo.getText());
                String asignatura = txtAsignatura.getText();
                int ciclo = cboCiclo.getSelectedIndex();
                int creditos = Integer.parseInt(txtCreditos.getText());
                int horas = Integer.parseInt(txtHoras.getText());
                Curso curso = new Curso(codigo, asignatura, ciclo, creditos, horas);
                cursos.add(curso);
                actualizarTabla();
            }
        });

        // Consultar Curso
        btnConsultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                actualizarTabla();
            }
        });

        // Modificar Curso
        btnModificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    Curso curso = cursos.get(selectedRow);
                    curso.setAsignatura(txtAsignatura.getText());
                    curso.setCiclo(cboCiclo.getSelectedIndex());
                    curso.setCreditos(Integer.parseInt(txtCreditos.getText()));
                    curso.setHoras(Integer.parseInt(txtHoras.getText()));
                    actualizarTabla();
                }
            }
        });

        // Eliminar Curso
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow >= 0) {
                    cursos.remove(selectedRow);
                    actualizarTabla();
                }
            }
        });
    }

    private void actualizarTabla() {
        model.setRowCount(0);
        for (Curso curso : cursos) {
            model.addRow(new Object[]{curso.getCodCurso(), curso.getAsignatura(), curso.getCiclo(), curso.getCreditos(), curso.getHoras()});
        }
    }
}
