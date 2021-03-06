package edu.cecar.vistas;

import edu.cecar.modelos.Album;
import edu.cecar.modelos.Coment;
import edu.cecar.modelos.Photo;
import edu.cecar.modelos.Post;
import edu.cecar.modelos.User;
import edu.cecar.controladores.ControladorAPIGoRest;
import edu.cecar.controladores.ControladorAlbum;
import edu.cecar.controladores.ControladorComent;
import edu.cecar.controladores.ControladorImagen;
import edu.cecar.controladores.ControladorPhoto;
import edu.cecar.controladores.ControladorPost;
import edu.cecar.controladores.ControladorRenderizarCelda;
import edu.cecar.controladores.ControladorUser;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Vincenzo Angelone
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    DefaultTableModel modeloTablaUserListar = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };

    public VistaPrincipal() {
        initComponents();
        panel_tablas2.setVisible(false);
        panel_listar.setVisible(false);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(modeloTablaUserListar);
        table_userListar.setRowSorter(sorter);
        String path = System.getProperty("user.dir");
        Image icon = Toolkit.getDefaultToolkit().getImage(path + "\\src\\main\\resources\\icono_gorest.png");
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        bt_Listar = new javax.swing.JButton();
        bt_Buscar = new javax.swing.JButton();
        bt_Migrar = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        panel_tablas2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_user = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_posts = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_comments = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table_albums = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        table_photos = new javax.swing.JTable();
        panel_listar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_userListar = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_cerrarSesion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menu_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GoRest");
        setExtendedState(MAXIMIZED_BOTH);
        setMinimumSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(255, 153, 51));
        jPanel.setPreferredSize(new java.awt.Dimension(125, 733));

        bt_Listar.setBackground(new java.awt.Color(255, 153, 1));
        bt_Listar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseline_list_black_18dp.png"))); // NOI18N
        bt_Listar.setText("Listar");
        bt_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ListarActionPerformed(evt);
            }
        });

        bt_Buscar.setBackground(new java.awt.Color(255, 153, 1));
        bt_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseline_search_black_18dp.png"))); // NOI18N
        bt_Buscar.setText("Buscar");
        bt_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_BuscarActionPerformed(evt);
            }
        });

        bt_Migrar.setBackground(new java.awt.Color(255, 153, 1));
        bt_Migrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseline_backup_black_18dp.png"))); // NOI18N
        bt_Migrar.setText("Migrar");
        bt_Migrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_MigrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_Listar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_Migrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_Buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(bt_Listar)
                .addGap(175, 175, 175)
                .addComponent(bt_Buscar)
                .addGap(180, 180, 180)
                .addComponent(bt_Migrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.setBackground(new java.awt.Color(255, 204, 102));
        panel.setMinimumSize(new java.awt.Dimension(0, 0));

        panel_tablas2.setBackground(new java.awt.Color(255, 204, 102));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(636, 1047));
        jScrollPane1.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("User");

        table_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(table_user);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Posts");

        table_posts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(table_posts);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Comments");

        table_comments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(table_comments);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Albums");

        table_albums.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(table_albums);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Photos");

        table_photos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(table_photos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane2))
                .addContainerGap(1021, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1178, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout panel_tablas2Layout = new javax.swing.GroupLayout(panel_tablas2);
        panel_tablas2.setLayout(panel_tablas2Layout);
        panel_tablas2Layout.setHorizontalGroup(
            panel_tablas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tablas2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1224, Short.MAX_VALUE))
        );
        panel_tablas2Layout.setVerticalGroup(
            panel_tablas2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        panel_listar.setBackground(new java.awt.Color(255, 204, 102));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Users");

        table_userListar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table_userListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_userListarMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                table_userListarMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(table_userListar);

        javax.swing.GroupLayout panel_listarLayout = new javax.swing.GroupLayout(panel_listar);
        panel_listar.setLayout(panel_listarLayout);
        panel_listarLayout.setHorizontalGroup(
            panel_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_listarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168))
        );
        panel_listarLayout.setVerticalGroup(
            panel_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_listarLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panel_tablas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addComponent(panel_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1243, Short.MAX_VALUE)))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(panel_tablas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 383, Short.MAX_VALUE))
            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelLayout.createSequentialGroup()
                    .addGap(96, 96, 96)
                    .addComponent(panel_listar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(749, Short.MAX_VALUE)))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseline_settings_applications_black_18dp_1.png"))); // NOI18N
        jMenu1.setText("Opciones");

        menu_cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseline_exit_to_app_black_18dp_1.png"))); // NOI18N
        menu_cerrarSesion.setText("Cerrar Sesión");
        menu_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(menu_cerrarSesion);
        jMenu1.add(jSeparator1);

        menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseline_power_settings_new_black_18dp.png"))); // NOI18N
        menu_salir.setText("Salir");
        menu_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_salirActionPerformed(evt);
            }
        });
        jMenu1.add(menu_salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1581, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_BuscarActionPerformed
        // TODO add your handling code here:
        panel_listar.setVisible(false);
        panel_tablas2.setVisible(false);
        table_albums.setModel(new DefaultTableModel());
        table_user.setModel(new DefaultTableModel());
        table_posts.setModel(new DefaultTableModel());
        table_comments.setModel(new DefaultTableModel());
        table_photos.setModel(new DefaultTableModel());
        try {
            int id_user;
            int id_album = 0;
            int id_post = 0;
            id_user = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del usuario: "));
            ControladorAPIGoRest controladorAPIGoRest = new ControladorAPIGoRest();
            ControladorImagen controladorImagen = new ControladorImagen();
            ArrayList<User> users = controladorAPIGoRest.obtenerUser();
            DefaultTableModel modeloUser = new DefaultTableModel() {
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            };
            modeloUser.addColumn("ID");
            modeloUser.addColumn("First Name");
            modeloUser.addColumn("Last Name");
            modeloUser.addColumn("Gender");
            modeloUser.addColumn("Dob");
            modeloUser.addColumn("Email");
            modeloUser.addColumn("Phone");
            modeloUser.addColumn("Website");
            modeloUser.addColumn("Address");
            modeloUser.addColumn("Status");
            modeloUser.addColumn("Self");
            modeloUser.addColumn("Edit");
            modeloUser.addColumn("Avatar");
            table_user.setModel(modeloUser);
            table_user.setRowHeight(120);
            table_user.getColumnModel().getColumn(12).setPreferredWidth(150);

            Object datosUser[] = new Object[13];

            ArrayList<Post> posts = controladorAPIGoRest.obtenerPost();
            DefaultTableModel modeloPost = new DefaultTableModel() {
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            };
            modeloPost.addColumn("ID Post");
            modeloPost.addColumn("ID User");
            modeloPost.addColumn("Title");
            modeloPost.addColumn("Body");
            modeloPost.addColumn("Self");
            modeloPost.addColumn("Edit");
            table_posts.setModel(modeloPost);
            String datosPost[] = new String[6];
            for (int i = 0; i < posts.size(); i++) {
                if (posts.get(i).getId_user() == id_user) {
                    id_post = posts.get(i).getId_post();
                    break;
                }
            }

            ArrayList<Photo> photos = controladorAPIGoRest.obtenerPhoto();
            DefaultTableModel modeloPhoto = new DefaultTableModel() {
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            };
            modeloPhoto.addColumn("ID Photo");
            modeloPhoto.addColumn("ID Album");
            modeloPhoto.addColumn("Title");
            modeloPhoto.addColumn("url");
            modeloPhoto.addColumn("Thumbnail");
            modeloPhoto.addColumn("Self");
            modeloPhoto.addColumn("Edit");
            table_photos.setModel(modeloPhoto);
            table_photos.setRowHeight(120);
            table_photos.getColumnModel().getColumn(4).setPreferredWidth(150);
            Object datosPhoto[] = new Object[7];

            ArrayList<Coment> coments = controladorAPIGoRest.obtenerComent();
            DefaultTableModel modeloComent = new DefaultTableModel() {
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            };
            modeloComent.addColumn("ID Coment");
            modeloComent.addColumn("ID Post");
            modeloComent.addColumn("Body");
            modeloComent.addColumn("Name");
            modeloComent.addColumn("Email");
            modeloComent.addColumn("Self");
            modeloComent.addColumn("Edit");
            table_comments.setModel(modeloComent);
            String datosComent[] = new String[7];

            ArrayList<Album> albums = controladorAPIGoRest.obtenerAlbum();
            DefaultTableModel modeloAlbum = new DefaultTableModel() {
                public boolean isCellEditable(int rowIndex, int mColIndex) {
                    return false;
                }
            };
            modeloAlbum.addColumn("ID Album");
            modeloAlbum.addColumn("ID User");
            modeloAlbum.addColumn("Title");
            modeloAlbum.addColumn("Self");
            modeloAlbum.addColumn("Edit");
            table_albums.setModel(modeloAlbum);
            String datosAlbum[] = new String[5];
            for (int i = 0; i < albums.size(); i++) {
                if (albums.get(i).getId_user() == id_user) {
                    id_album = albums.get(i).getId_album();
                    break;
                }
            }

            users.stream().filter(u -> u.getId_user() == id_user).forEach((u) -> {
                try {
                    datosUser[0] = u.getId_user() + "";
                    datosUser[1] = u.getFirst_name();
                    datosUser[2] = u.getLast_name();
                    datosUser[3] = u.getGender();
                    datosUser[4] = u.getDob();
                    datosUser[5] = u.getEmail();
                    datosUser[6] = u.getPhone();
                    datosUser[7] = u.getWebsite();
                    datosUser[8] = u.getAdress();
                    datosUser[9] = u.getStatus();
                    datosUser[10] = u.getSelf();
                    datosUser[11] = u.getEdit();
                    ImageIcon icon = new ImageIcon(controladorImagen.descargarImagen(u.getAvatar(), u.getFirst_name()));
                    table_user.getColumnModel().getColumn(12).setCellRenderer(new ControladorRenderizarCelda());
                    datosUser[12] = icon;
                    modeloUser.addRow(datosUser);
                } catch (IOException ex) {
                    Logger.getLogger(VistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            });

            if (table_user.getRowCount() > 0) {
                panel_tablas2.setVisible(true);

                posts.stream().filter(p -> p.getId_user() == id_user).forEach((p) -> {
                    datosPost[0] = p.getId_post() + "";
                    datosPost[1] = p.getId_user() + "";
                    datosPost[2] = p.getTitle();
                    datosPost[3] = p.getBody();
                    datosPost[4] = p.getSelf();
                    datosPost[5] = p.getEdit();
                    modeloPost.addRow(datosPost);
                });

                albums.stream().filter(a -> a.getId_user() == id_user).forEach((a) -> {
                    datosAlbum[0] = a.getId_album() + "";
                    datosAlbum[1] = a.getId_user() + "";
                    datosAlbum[2] = a.getTitle();
                    datosAlbum[3] = a.getSelf();
                    datosAlbum[4] = a.getEdit();
                    modeloAlbum.addRow(datosAlbum);
                });

                for (int i = 0; i < coments.size(); i++) {
                    if (coments.get(i).getId_post() == id_post) {
                        datosComent[0] = coments.get(i).getId_coment() + "";
                        datosComent[1] = coments.get(i).getId_post() + "";
                        datosComent[2] = coments.get(i).getBody();
                        datosComent[3] = coments.get(i).getName();
                        datosComent[4] = coments.get(i).getEmail();
                        datosComent[5] = coments.get(i).getSelf();
                        datosComent[6] = coments.get(i).getEdit();
                        modeloComent.addRow(datosComent);
                    }
                }

                for (int i = 0; i < photos.size(); i++) {
                    if (photos.get(i).getId_album() == id_album) {
                        datosPhoto[0] = photos.get(i).getId_photo() + "";
                        datosPhoto[1] = photos.get(i).getId_album() + "";
                        datosPhoto[2] = photos.get(i).getTitle();
                        datosPhoto[3] = photos.get(i).getUrl();
                        ImageIcon thumbnail = new ImageIcon(controladorImagen.descargarImagen(photos.get(i).getThumbnail(), "thumbnail"));
                        table_photos.getColumnModel().getColumn(4).setCellRenderer(new ControladorRenderizarCelda());
                        datosPhoto[4] = thumbnail;
                        datosPhoto[5] = photos.get(i).getSelf();
                        datosPhoto[6] = photos.get(i).getEdit();
                        modeloPhoto.addRow(datosPhoto);
                    }
                }
            } else {
                panel_tablas2.setVisible(false);
                JOptionPane.showMessageDialog(null, "ID de usuario no encontrado.");
            }

        } catch (Exception e) {
            panel_tablas2.setVisible(false);
            JOptionPane.showMessageDialog(null, "ID de usuario erroneo");

        }


    }//GEN-LAST:event_bt_BuscarActionPerformed

    private void bt_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ListarActionPerformed
        // TODO add your handling code here:
        panel_tablas2.setVisible(false);
        panel_listar.setVisible(true);
        modeloTablaUserListar.setColumnCount(0);
        modeloTablaUserListar.setRowCount(0);
        ControladorAPIGoRest controladorAPIGoRest = new ControladorAPIGoRest();
        ArrayList<User> users = controladorAPIGoRest.obtenerUser();
        modeloTablaUserListar.addColumn("First Name");
        modeloTablaUserListar.addColumn("Last Name");
        modeloTablaUserListar.addColumn("Gender");
        modeloTablaUserListar.addColumn("Dob");
        modeloTablaUserListar.addColumn("Email");
        modeloTablaUserListar.addColumn("Phone");
        modeloTablaUserListar.addColumn("Website");
        modeloTablaUserListar.addColumn("Address");
        modeloTablaUserListar.addColumn("Status");
        String datos[] = new String[9];
        for (User user : users) {
            datos[0] = user.getFirst_name();
            datos[1] = user.getLast_name();
            datos[2] = user.getGender();
            datos[3] = user.getDob();
            datos[4] = user.getEmail();
            datos[5] = user.getPhone();
            datos[6] = user.getWebsite();
            datos[7] = user.getAdress();
            datos[8] = user.getStatus();
            modeloTablaUserListar.addRow(datos);
        }
        table_userListar.setModel(modeloTablaUserListar);
    }//GEN-LAST:event_bt_ListarActionPerformed

    private void bt_MigrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_MigrarActionPerformed
        // TODO add your handling code here:
        panel_tablas2.setVisible(false);
        panel_listar.setVisible(false);
        ControladorUser controladorUser = new ControladorUser();
        ControladorPost controladorPost = new ControladorPost();
        ControladorPhoto controladorPhoto = new ControladorPhoto();
        ControladorComent controladorComent = new ControladorComent();
        ControladorAlbum controladorAlbum = new ControladorAlbum();
        ControladorAPIGoRest controladorAPIGoRest = new ControladorAPIGoRest();

        ArrayList<User> users = controladorAPIGoRest.obtenerUser();
        ArrayList<Post> posts = controladorAPIGoRest.obtenerPost();
        ArrayList<Photo> photos = controladorAPIGoRest.obtenerPhoto();
        ArrayList<Coment> coments = controladorAPIGoRest.obtenerComent();
        ArrayList<Album> albums = controladorAPIGoRest.obtenerAlbum();

        try {
            controladorUser.eliminarTodo();
            controladorComent.eliminarTodo();
            controladorAlbum.eliminarTodo();
            controladorPhoto.eliminarTodo();
            controladorPost.eliminarTodo();
            for (int i = 0; i < users.size(); i++) {
                controladorUser.guardar(users.get(i));
            }
            for (int i = 0; i < posts.size(); i++) {
                controladorPost.guardar(posts.get(i));
            }
            for (int i = 0; i < albums.size(); i++) {
                controladorAlbum.guardar(albums.get(i));
            }
            for (int i = 0; i < photos.size(); i++) {
                controladorPhoto.guardar(photos.get(i));
            }
            for (int i = 0; i < coments.size(); i++) {
                controladorComent.guardar(coments.get(i));
            }

            JOptionPane.showMessageDialog(null, "Datos migrados a la base de datos correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error al migrar los datos a la base de datos.");
        }


    }//GEN-LAST:event_bt_MigrarActionPerformed

    private void table_userListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userListarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_table_userListarMouseClicked

    private void table_userListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_userListarMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_table_userListarMousePressed

    private void menu_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cerrarSesionActionPerformed
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogPanel().setVisible(true);
            }
        });
    }//GEN-LAST:event_menu_cerrarSesionActionPerformed

    private void menu_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menu_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Buscar;
    private javax.swing.JButton bt_Listar;
    private javax.swing.JButton bt_Migrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem menu_cerrarSesion;
    private javax.swing.JMenuItem menu_salir;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel_listar;
    private javax.swing.JPanel panel_tablas2;
    private javax.swing.JTable table_albums;
    private javax.swing.JTable table_comments;
    private javax.swing.JTable table_photos;
    private javax.swing.JTable table_posts;
    private javax.swing.JTable table_user;
    private javax.swing.JTable table_userListar;
    // End of variables declaration//GEN-END:variables
}
