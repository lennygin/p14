//13.68, 13.67, 13.59, 13.64, 13.76, 13.89, 13.95, 13.92, 13.93, 13.95, 14.12, 14.26, 14.47
public class Practica14 {
    public static void main(String[] args) {
        ventana ven = new ventana();
        ven.setVisible(true);
    }
}
/*    public static void main(String[] args) {
        linearRegression ec = new linearRegression();
        Scanner line = new Scanner(System.in);
        double year;
        int anios;
        System.out.print("\033[H\033[2J");
        do {
            System.out.println("A partir de qué año quiere ingresar la temperatura:");
            year = line.nextDouble();
        } while (year < 1890 || year > 2000);

        do {
            System.out.println("Cuántos años quiere ingresar?");
            anios = line.nextInt();
            if (anios<=1){
                System.out.println("Tiene que ingresar mímino 2 años");
            anios = line.nextInt();
        }

        } while (anios > (((2010 - year) / 10) + 1));

        int i = 0;
        double[] arrayX = new double[anios], arrayY = new double[anios];
        double temp = year;
        do {
            System.out.println("Ingresa la temperatura del año " + String.format("%.2f", temp) + " : ");
            arrayX[i] = temp;
            arrayY[i] = line.nextDouble();
            temp += 10;
            i++;
        } while (temp <= (year + (10 * (anios - 1))));

        ec.fsumX(arrayX);
        ec.fsumXSquared(arrayX);
        ec.fsumY(arrayY);
        ec.fsumXY(arrayX, arrayY);
        ec.setSlope();
        ec.setOrigin();
        double m = ec.getSlope();
        double b = ec.getOrigin();
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Ingresa el año para el que se quiere estimar la temperatura: ");
        year = line.nextDouble();
        double formula = (m * year) + b;
        System.out.println("\n\n-------------------\nAño   |   ºC\n-------------------\n" + String.format("%.0f", year) + "  |   " + String.format("%.2f", formula) + "\n-------------------");
    }*/
