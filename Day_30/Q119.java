import java.util.*;

public class Q119 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int MAX = 100;

        int[] empId = new int[MAX];
        String[] name = new String[MAX];
        int[] age = new int[MAX];
        String[] gender = new String[MAX];
        String[] address = new String[MAX];
        String[] email = new String[MAX];
        String[] contact = new String[MAX];
        String[] department = new String[MAX];
        String[] designation = new String[MAX];
        String[] qualification = new String[MAX];
        double[] salary = new double[MAX];
        String[] joiningDate = new String[MAX];
        int[] experience = new int[MAX];

        int count = 0;
        int choice;

        do {

            System.out.println("\n========== EMPLOYEE MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Department Wise Employees");
            System.out.println("7. Total Employees");
            System.out.println("8. Exit");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {

                case 1:

                    if(count==MAX)
                    {
                        System.out.println("Employee List Full.");
                        break;
                    }

                    System.out.print("Enter Employee ID : ");
                    empId[count]=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    name[count]=sc.nextLine();

                    System.out.print("Enter Age : ");
                    age[count]=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Gender : ");
                    gender[count]=sc.nextLine();

                    System.out.print("Enter Address : ");
                    address[count]=sc.nextLine();

                    System.out.print("Enter Email : ");
                    email[count]=sc.nextLine();

                    System.out.print("Enter Contact Number : ");
                    contact[count]=sc.nextLine();

                    System.out.print("Enter Department : ");
                    department[count]=sc.nextLine();

                    System.out.print("Enter Designation : ");
                    designation[count]=sc.nextLine();

                    System.out.print("Enter Qualification : ");
                    qualification[count]=sc.nextLine();

                    System.out.print("Enter Salary : ");
                    salary[count]=sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Joining Date : ");
                    joiningDate[count]=sc.nextLine();

                    System.out.print("Enter Experience (Years) : ");
                    experience[count]=sc.nextInt();

                    count++;

                    System.out.println("Employee Added Successfully.");
                    break;                case 2:

                    if(count==0)
                    {
                        System.out.println("No Employee Record Found.");
                    }
                    else
                    {
                        for(int i=0;i<count;i++)
                        {
                            System.out.println("\n====================================");
                            System.out.println("Employee ID      : " + empId[i]);
                            System.out.println("Name             : " + name[i]);
                            System.out.println("Age              : " + age[i]);
                            System.out.println("Gender           : " + gender[i]);
                            System.out.println("Address          : " + address[i]);
                            System.out.println("Email            : " + email[i]);
                            System.out.println("Contact Number   : " + contact[i]);
                            System.out.println("Department       : " + department[i]);
                            System.out.println("Designation      : " + designation[i]);
                            System.out.println("Qualification    : " + qualification[i]);
                            System.out.println("Salary           : " + salary[i]);
                            System.out.println("Joining Date     : " + joiningDate[i]);
                            System.out.println("Experience       : " + experience[i] + " Years");
                            System.out.println("====================================");
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search : ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(int i=0;i<count;i++)
                    {
                        if(empId[i]==searchId)
                        {
                            found=true;

                            System.out.println("\nEmployee Found");
                            System.out.println("ID : " + empId[i]);
                            System.out.println("Name : " + name[i]);
                            System.out.println("Department : " + department[i]);
                            System.out.println("Designation : " + designation[i]);
                            System.out.println("Salary : " + salary[i]);

                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID to Update : ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    boolean updated = false;

                    for(int i=0;i<count;i++)
                    {
                        if(empId[i]==updateId)
                        {
                            updated=true;

                            System.out.print("Enter New Name : ");
                            name[i]=sc.nextLine();

                            System.out.print("Enter New Age : ");
                            age[i]=sc.nextInt();
                            sc.nextLine();

                            System.out.print("Enter New Gender : ");
                            gender[i]=sc.nextLine();

                            System.out.print("Enter New Address : ");
                            address[i]=sc.nextLine();

                            System.out.print("Enter New Email : ");
                            email[i]=sc.nextLine();

                            System.out.print("Enter New Contact Number : ");
                            contact[i]=sc.nextLine();

                            System.out.print("Enter New Department : ");
                            department[i]=sc.nextLine();

                            System.out.print("Enter New Designation : ");
                            designation[i]=sc.nextLine();

                            System.out.print("Enter New Qualification : ");
                            qualification[i]=sc.nextLine();

                            System.out.print("Enter New Salary : ");
                            salary[i]=sc.nextDouble();
                            sc.nextLine();

                            System.out.print("Enter New Joining Date : ");
                            joiningDate[i]=sc.nextLine();

                            System.out.print("Enter New Experience : ");
                            experience[i]=sc.nextInt();

                            System.out.println("Employee Updated Successfully.");

                            break;
                        }
                    }

                    if(!updated)
                    {
                        System.out.println("Employee Not Found.");
                    }

                    break;                case 5:

                    System.out.print("Enter Employee ID to Delete : ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for(int i=0;i<count;i++)
                    {
                        if(empId[i]==deleteId)
                        {
                            for(int j=i;j<count-1;j++)
                            {
                                empId[j]=empId[j+1];
                                name[j]=name[j+1];
                                age[j]=age[j+1];
                                gender[j]=gender[j+1];
                                address[j]=address[j+1];
                                email[j]=email[j+1];
                                contact[j]=contact[j+1];
                                department[j]=department[j+1];
                                designation[j]=designation[j+1];
                                qualification[j]=qualification[j+1];
                                salary[j]=salary[j+1];
                                joiningDate[j]=joiningDate[j+1];
                                experience[j]=experience[j+1];
                            }

                            count--;

                            deleted = true;
                            System.out.println("Employee Deleted Successfully.");
                            break;
                        }
                    }

                    if(!deleted)
                    {
                        System.out.println("Employee Not Found.");
                    }

                    break;

                case 6:

                    System.out.print("Enter Department Name : ");
                    String dept = sc.nextLine();

                    boolean deptFound = false;

                    for(int i=0;i<count;i++)
                    {
                        if(department[i].equalsIgnoreCase(dept))
                        {
                            deptFound = true;

                            System.out.println("\n================================");
                            System.out.println("Employee ID    : " + empId[i]);
                            System.out.println("Name           : " + name[i]);
                            System.out.println("Department     : " + department[i]);
                            System.out.println("Designation    : " + designation[i]);
                            System.out.println("Qualification  : " + qualification[i]);
                            System.out.println("Salary         : " + salary[i]);
                            System.out.println("================================");
                        }
                    }

                    if(!deptFound)
                    {
                        System.out.println("No Employee Found in this Department.");
                    }

                    break;                case 7:

                    System.out.println("\nTotal Employees : " + count);

                    break;

                case 8:

                    System.out.println("\nThank You for Using Employee Management System.");

                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while(choice != 8);

        sc.close();

    }
}