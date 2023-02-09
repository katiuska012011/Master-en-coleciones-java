package Mapas.enterprises;

import java.util.*;

public class EnterpriseApp {

    private Scanner sc;
    private Map<Enterprise, List<Employee>> enterprises;

    public EnterpriseApp(){
        enterprises = new HashMap<>();
        sc = new Scanner(System.in);
    }
    public void init() {
        int op;

        do {
            System.out.println("\n\n\t Menú \t");
            System.out.println("--Empleados--");
            System.out.println("1.- Dar de alta empresa: ");
            System.out.println("2.- Dar de alta empleado: ");
            System.out.println("3.- Imprimir relación: ");
            System.out.println("4.- Salir");

            System.out.println("\nSeleccione la opción deseada: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    newEnterprise();
                    break;
                case 2:
                    newEmployee();
                    break;
                case 3:
                    print();
                    break;
            }

        } while (op != 4);
    }

    public void newEnterprise() {
        System.out.println("Proporciona el id de la empresa:");
        int id = sc.nextInt();
        System.out.println("Nombre de la empresa");
        String name = sc.next();
        System.out.println("Proporciona el sector de la empresa");
        String sector = sc.next();
        Enterprise enterprise = new Enterprise(id, name, sector);
        this.enterprises.put(enterprise, new LinkedList<Employee>());
    }

    public void newEmployee() {
        System.out.println("Proporciona el id del empleado");
        int id = sc.nextInt();
        System.out.println("Proporciona el nombre del empleado");
        String name = sc.next();
        System.out.println("Proporciona el nss del empleado");
        String nss = sc.next();
        System.out.println("Proporciona la empresa del empleado");
        String enterpriseName = sc.next();
        Employee employee = new Employee(id, name, nss, enterpriseName);
        Enterprise enterprise = new Enterprise(enterpriseName);

        if (enterprises.containsKey(enterprise)) {
            enterprises.get(enterprise).add(employee);
        } else {
            enterprises.put(enterprise, new LinkedList<Employee>());
            enterprises.get(enterprise).add(employee);
        }
    }

    public void print() {
        System.out.println("\n");
        for (Map.Entry<Enterprise, List<Employee>> entry : enterprises.entrySet()) {
            Enterprise enterprise = entry.getKey();
            List<Employee> employee = entry.getValue();

            System.out.println("Empresa: " + enterprise.getName() );

            for (Employee employee1 : employee) {
                System.out.println(employee1);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        EnterpriseApp app = new EnterpriseApp();
        app.init();
    }
}
