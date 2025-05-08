import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //El proyecto de nuestro grupo sera realizar un sistema de notas, en el cual profesores podran registrar las notas de sus estudiantes y los estudiantes podran visualizarlas
        //Integrantes:
        //Esteban Garces Alzate 1000088855 egarces@cesde.net
        //Robinson Duvan Gutierrez echavarria 1020471758 rgutierrezdu@cesde.net
        //Valentina Osorno Cadavid 1035871938  vosorno1@cesde.net
        //Luis Miguel Altamiranda Marbello 1065292450 laltamiranda@cesde.net

        //Evidencia de producto:
        //Ingrese la información de un estudiante del cesde (que se evalúa en tres momento, para cada momento ingresar 3 notas) definir la nota que lleva hasta ese momento de evaluación y decir cuánto le falta para ganar

        Scanner sc = new Scanner(System.in);

        String estudiante,usuario,contrasena = "";
        double nota_del_momento_uno, nota_final_del_momento_uno, nota_del_momento_dos, nota_final_del_momento_dos, nota_del_momento_tres, nota_final = 0;
        double nota_final_del_momento_tres, primera_nota_del_momento_uno, segunda_nota_del_momento_uno, tercera_nota_del_momento_uno = 0;
        double primera_nota_del_momento_dos, segunda_nota_del_momento_dos, tercera_nota_del_momento_dos = 0;
        double primera_nota_del_momento_tres, segunda_nota_del_momento_tres, tercera_nota_del_momento_tres = 0;

        System.out.println("------------------------\nBienvenido al sistema de notas VLER\n------------------------\nInicio de sesión\n------------------------\nUsuario: ");
        usuario = sc.nextLine();
        System.out.println("Contraseñá: ");
        contrasena = sc.nextLine();
        if (usuario.equals("admin") && contrasena.equals("admin")){

            System.out.println("------------------------\nIngrese el nombre del estudiante");
            estudiante = sc.nextLine();
            System.out.println("Ingrese la primera nota del primer momento");
            primera_nota_del_momento_uno = sc.nextDouble();
            System.out.println("Ingrese la segunda nota del primer momento");
            segunda_nota_del_momento_uno = sc.nextDouble();
            System.out.println("Ingrese la tercera nota del primer momento");
            tercera_nota_del_momento_uno = sc.nextDouble();

            nota_final_del_momento_uno = (primera_nota_del_momento_uno*0.30)+(segunda_nota_del_momento_uno*0.35)+(tercera_nota_del_momento_uno*0.35);
            nota_del_momento_uno = nota_final_del_momento_uno*0.3;
            System.out.println("--------------------\nLa nota final de "+ estudiante + " En el primer momento es "+ nota_final_del_momento_uno + " La nota que falta para ganar es de "+ (3.0 - nota_del_momento_uno)/0.35 +"\n--------------------");

            System.out.println("Ingrese la primera nota del segundo momento");
            primera_nota_del_momento_dos = sc.nextDouble();
            System.out.println("Ingrese la segunda nota del segundo momento");
            segunda_nota_del_momento_dos = sc.nextDouble();
            System.out.println("Ingrese la tercera nota del segundo momento");
            tercera_nota_del_momento_dos = sc.nextDouble();

            nota_final_del_momento_dos = (primera_nota_del_momento_dos*0.30)+(segunda_nota_del_momento_dos*0.35)+(tercera_nota_del_momento_dos*0.35);
            nota_del_momento_dos = nota_final_del_momento_dos*0.35;
            System.out.println("--------------------\nLa nota final de "+ estudiante +" En el segundo momento es "+ nota_final_del_momento_dos+" La nota que falta para ganar es de "+ (3.0 - (nota_del_momento_dos + nota_del_momento_uno))/0.35+"\n--------------------");

            System.out.println("Ingrese la primera nota del tercer momento");
            primera_nota_del_momento_tres = sc.nextDouble();
            System.out.println("Ingrese la segunda nota del tercer momento");
            segunda_nota_del_momento_tres = sc.nextDouble();
            System.out.println("Ingrese la tercera nota del tercer momento");
            tercera_nota_del_momento_tres = sc.nextDouble();

            nota_final_del_momento_tres = ((primera_nota_del_momento_tres*0.30)+(segunda_nota_del_momento_tres*0.35)+(tercera_nota_del_momento_tres*0.35));
            nota_del_momento_tres = nota_final_del_momento_tres*0.35;
            nota_final = nota_del_momento_uno + nota_del_momento_dos + nota_del_momento_tres;
            System.out.println("--------------------\nLa nota final de "+ estudiante +" En el tercer momento es "+ nota_final_del_momento_tres +"\nSu nota final de la materia es de "+ nota_final +"\n--------------------");

            if (nota_final>=3.0){
                System.out.println("Felicidades, ganaste");
            }else {
                System.out.println("Perdiste");
            }

        }else {
            System.out.println("------------------------\nCredenciales incorrectas");
        }
    }
}