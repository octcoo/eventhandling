
package tugas3;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.BorderFactory;
import java.awt.Font;


public class Form extends JFrame {
    //buat form
    JFrame frame = new JFrame();
    JLabel label = new JLabel("FORM MAHASISWA");
    JLabel nama = new JLabel("Nama Mahasiswa    : ");
    JTextField namamhs = new JTextField();
    JLabel jeniskelamin = new JLabel ("Jenis Kelamin           : ");
    JRadioButton jenislaki = new JRadioButton("Laki-laki");
    JRadioButton jenisperempuan = new JRadioButton("Perempuan");
    ButtonGroup pencetjenis = new ButtonGroup();
    JTextField hasiljeniskelamin = new JTextField(" Jenis Kelamin anda yang mana?");
    JLabel agama = new JLabel("Agama                        : ");
    String namaAgama[] = {"Islam","Kristen","Katolik","Hindu","Budha","Konghucu"};
    JComboBox pilihagama = new JComboBox(namaAgama);
    JTextField hasilagama = new JTextField(" Agama anda diisi woy!");
    JLabel hobi = new JLabel("Hobi                             : ");
    JCheckBox renang = new JCheckBox("Renang");
    JCheckBox basket = new JCheckBox("Basket");
    JCheckBox voli = new JCheckBox("Voli");
    JTextField hasilhobi = new JTextField(" Hobimu apa?");
    
    //buat yang mouse listener
    JLabel labelmouse = new JLabel("JENIS KENDARAAN"); 
    JTextField motor = new JTextField("Motor");
    JTextField mobil = new JTextField("Mobil");
    JTextField jalan = new JTextField("Jalan kaki");
    JTextField nebeng = new JTextField("Nebeng pacar");
    JTextField hasil = new JTextField("ARAHKAN MOUSE KESINI");
    JTextField hasilbawah = new JTextField();
    
    //deklarasi font
    Font font = new Font("SanSerif", Font.BOLD, 30);
    Font fontdua = new Font("SanSerif", Font.BOLD, 15);
    
    public Form(){
        frame.setTitle("Biodata Mahasiswa"); //title bar
        frame.setSize(800,700); //ukuran window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); //biar gabisa dilebarin windownya
        frame.setVisible(true); //pake window gak? pake. 
        //kalo gapake di false/gausa setVisible. tapi percuma juga tugasmu gapake setVisible
        frame.setLayout(null); //gapake layout-layoutan ribet.
        
        //nampilin judul di window
        frame.add(label);
        label.setBounds(330, 30, 300, 10); //ngatur letak judul
        
        //nampilin nama mahasiswa
        frame.add(nama);
        nama.setBounds(130, 70, 300, 30);
        frame.add(namamhs);
        namamhs.setBounds(300, 70, 300, 30);
        namamhs.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        
        //nampilin jenis kelamin
        frame.add(jeniskelamin);
        jeniskelamin.setBounds(130, 70, 300, 100);
        frame.add(jenislaki);
        jenislaki.setBounds(300, 105, 80, 30);
        frame.add(jenisperempuan);
        jenisperempuan.setBounds(400, 105, 200, 30);
        //karena merupakan radio button. ini efek button group
        pencetjenis.add(jenislaki);
        pencetjenis.add(jenisperempuan);
        //buat ngisi text field yang otomatis berubah kalo pilih jenis kelamin
        jenislaki.addItemListener((ItemEvent event) -> {
            //jika yang dipilih laki
            if(event.getSource() == jenislaki){
                //deklarasi text berubah jadi item yang dipilih.
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hasiljeniskelamin.setText("Laki-laki");}}
        });
        jenisperempuan.addItemListener((ItemEvent event) -> {
            if(event.getSource() == jenisperempuan){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hasiljeniskelamin.setText("Perempuan");}}
        });
        frame.add(hasiljeniskelamin);
        hasiljeniskelamin.setBounds(300, 140, 300, 30);
        hasiljeniskelamin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        hasiljeniskelamin.setEditable(false); //text field gabisa diedit
        
        //nampilin agama
        frame.add(agama);
        agama.setBounds(130, 190, 300, 30);
        frame.add(pilihagama);
        pilihagama.setBounds(300, 190, 100, 30);
        pilihagama.addItemListener((ItemEvent event) -> {
            if(event.getStateChange() == ItemEvent.SELECTED){
                if(pilihagama.getSelectedIndex() == 0 ){
                     hasilagama.setText("Islam");}
                else if(pilihagama.getSelectedIndex() == 1){
                     hasilagama.setText("Kristen");}
                else if(pilihagama.getSelectedIndex() == 2){
                     hasilagama.setText("Katolik");}
                else if(pilihagama.getSelectedIndex() == 3){
                     hasilagama.setText("Hindu");}
                else if(pilihagama.getSelectedIndex() == 4){
                     hasilagama.setText("Budha");}
                else if(pilihagama.getSelectedIndex() == 5){
                     hasilagama.setText("Konghucu");}}
        });
        frame.add(hasilagama);
        hasilagama.setBounds(300, 230, 300, 30);
        hasilagama.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        hasilagama.setEditable(false);
        
        //nampilin hobi
        frame.add(hobi);
        hobi.setBounds(130, 290, 150, 20);
        frame.add(renang);
        renang.setBounds(300, 290, 100, 20);
        frame.add(basket);
        basket.setBounds(400, 290, 100, 20);
        frame.add(voli);
        voli.setBounds(500, 290, 100, 20);
        renang.addItemListener((ItemEvent event) -> {
            if(event.getSource() == renang){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hasilhobi.setText("Renang");
                    //biar pas di run belom pilih apa-apa
                    renang.setSelected(true);}}
            });
        basket.addItemListener((ItemEvent event) -> { 
            if(event.getSource() == basket){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hasilhobi.setText("Basket");
                    basket.setSelected(true);}}
            });
        voli.addItemListener((ItemEvent event) -> { 
            if(event.getSource() == voli){
                if(event.getStateChange() == ItemEvent.SELECTED){
                    hasilhobi.setText("Voli");
                    voli.setSelected(true);}}
            });
        frame.add(hasilhobi);
        hasilhobi.setBounds(300, 320, 300, 30);
        hasilhobi.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        hasilhobi.setEditable(false);
        
        //mouse listener
        frame.add(motor);
        motor.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        motor.setBackground(Color.pink);
        motor.setFont(fontdua);
        motor.setBounds(130, 370, 100, 40);
        motor.setEditable(false);
        motor.setHorizontalAlignment(JTextField.CENTER);
        //menambahkan fitur mouse listener
        motor.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                hasilbawah.setText(motor.getText());}
        });
        
        //mouse listener
        frame.add(mobil);
        mobil.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        mobil.setBackground(Color.pink);
        mobil.setFont(fontdua);
        mobil.setBounds(260, 370, 100, 40);
        mobil.setEditable(false);
        mobil.setHorizontalAlignment(JTextField.CENTER);
        //fitur mouse listener
        mobil.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                hasilbawah.setText(mobil.getText());}
        });
        
        //mouse listener
        frame.add(jalan);
        jalan.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        jalan.setBackground(Color.pink);
        jalan.setFont(fontdua);
        jalan.setBounds(380, 370, 100, 40);
        jalan.setEditable(false);
        jalan.setHorizontalAlignment(JTextField.CENTER);
        //fitur mouse listener
        jalan.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                hasilbawah.setText(jalan.getText());}
        });
        
        //mouse listener
        frame.add(nebeng);
        nebeng.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        nebeng.setBackground(Color.pink);
        nebeng.setFont(fontdua);
        nebeng.setBounds(500, 370, 110, 40);
        nebeng.setEditable(false);
        nebeng.setHorizontalAlignment(JTextField.CENTER);
        //fitur mouse listener
        nebeng.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent me){
                hasilbawah.setText(nebeng.getText());}
        });
        
        //hasil frame
        frame.add(hasil);
        hasil.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        hasil.setBounds(295, 450, 155, 30);
        hasil.setEditable(false);
        hasil.setHorizontalAlignment(JTextField.CENTER);
        hasil.addMouseMotionListener(new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent me){
                hasilbawah.setText(null);}
        });
        
        //hasil frame bawahnya
        frame.add(hasilbawah);
        hasilbawah.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2)); 
        hasilbawah.setFont(font);
        hasilbawah.setBounds(260, 500, 218, 80);
        hasilbawah.setEditable(false);
        hasilbawah.setHorizontalAlignment(JTextField.CENTER);
}}
