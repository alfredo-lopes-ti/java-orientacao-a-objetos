package _01_introducao_oo.school_students.entities;

public class Student {

    // Atributos privados (Segurança de dados)
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    // Getters e Setters para controle de acesso
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    // Método que calcula a nota final de forma dinâmica
    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }

    // Regra de Negócio: Verifica se faltaram pontos para a aprovação (Média 60.0)
    public double missingPoints() {
        if (finalGrade() < 60.0) {
            return 60.0 - finalGrade();
        }
        return 0.0;
    }

}



