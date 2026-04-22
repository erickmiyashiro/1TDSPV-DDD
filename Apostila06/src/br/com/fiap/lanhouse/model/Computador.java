package br.com.fiap.lanhouse.model;

public class Computador {
aula07

    private String processador;
    private int id;
    private String placaVideo;
    private double armazenamento;
    private boolean possuiSsd;
    private int memoriaRam;

    private String processador;
    private int id;
    private String placa_de_video;
    private int armazenamneto;
    private boolean e_sdd;
    private int memoria_ram;


    public Computador(String processador, int id){
        this.processador = processador;
        this.id = id;

    }

    public Computador(String processador, int id, String placaVideo, double armazenamento, boolean possuiSsd, int memoriaRam){
        this(processador, id);
        this.placaVideo = placaVideo;
        this.memoriaRam = memoriaRam;
        this.possuiSsd = possuiSsd;
        this.armazenamento = armazenamento;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;


    }

    public Computador(String processador, int id, String placa_de_video, int armazenamneto, boolean e_sdd, int memoria_ram){
        this(processador, id);
        this.placa_de_video = placa_de_video;
        this.armazenamneto = armazenamneto;
        this.e_sdd = e_sdd;
        this.memoria_ram = memoria_ram;



    }

    public String getProcessaor() {
        return processaor;
    }

    public void setProcessaor(String processaor) {
        this.processaor = processaor;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getPlacaVideo() {
        return placaVideo;
    }

    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean getPossuiSsd() {
        return possuiSsd;
    }

    public void setPossuiSsd(boolean possuiSsd) {
        this.possuiSsd = possuiSsd;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;

    public String getPlaca_de_video() {
        return placa_de_video;
    }

    public void setPlaca_de_video(String placa_de_video) {
        this.placa_de_video = placa_de_video;
    }

    public int getArmazenamneto() {
        return armazenamneto;
    }

    public void setArmazenamneto(int armazenamneto) {
        this.armazenamneto = armazenamneto;
    }

    public boolean isE_sdd() {
        return e_sdd;
    }

    public void setE_sdd(boolean e_sdd) {
        this.e_sdd = e_sdd;
    }

    public int getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(int memoria_ram) {
        this.memoria_ram = memoria_ram;

    }
}
