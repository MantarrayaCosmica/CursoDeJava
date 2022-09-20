public class Main {

    public static void main(String[] args) {

        Profesor p1 = new Profesor("a","b",999,2);

        System.out.println(p1.calcularSueldo());

        Estudiante e1 = new Estudiante("c","d",888);

        System.out.println(e1.toString());

    }
}
