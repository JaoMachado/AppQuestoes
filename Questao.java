package com.example.trabalhoavaliativo;

public class Questao {
    private String pergunta;
    private String op1;
    private String op2;
    private String op3;
    private String op4;
    private String op5;
    private String opCerto;
    private String materia;
    private int idImagem;

    public String getMateria() { return materia; }

    public void setMateria(String materia) { this.materia = materia; }

    public int getIdImagem() { return idImagem; }

    public void setIdImagem(int idImagem) { this.idImagem = idImagem; }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public Questao() {}

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getOp5() { return op5; }

    public void setOp5(String op5) { this.op5 = op5; }

    public String getOpCerto() { return opCerto; }

    public void setOpCerto(String opCerto) { this.opCerto = opCerto; }
}

