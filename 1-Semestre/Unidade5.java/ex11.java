public class ex11 {
    public static void main(String[] args) {

        int horasPorDia = 16;
        int biscoitosQuebradosNoDia = 0;

        for (int hora = 1; hora <= horasPorDia; hora++) {
            int biscoitosQuebradosNaHora = calcularBiscoitosQuebrados(hora);
            biscoitosQuebradosNoDia += biscoitosQuebradosNaHora;

            if (hora % 1 == 0) {
                System.out.println("No dia " + (hora / horasPorDia) + ", após " + hora + " horas, foram quebrados " + biscoitosQuebradosNoDia + " biscoitos.");
            }
        }
    }

    public static int calcularBiscoitosQuebrados(int hora) {
        int biscoitosQuebradosNaHora = 1;

        for (int i = 1; i < hora; i++) {
            biscoitosQuebradosNaHora *= 3;
        }

        return biscoitosQuebradosNaHora;
    }
}
