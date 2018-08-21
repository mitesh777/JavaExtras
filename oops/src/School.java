
public class School {
	private Student[] students=new Student[100];//has-a relationship with multiplicity *
	private Teacher[] teachers=new Teacher[20];
	private int teacherNum;
	private int studentNum;
	public void addTeacher(Teacher teacher) {
		if(teacherNum<20)
		{
		teachers[teacherNum]=teacher;
		teacherNum++;
		}
		else 
			System.out.print("Sorry,Cant take more teachers");
		}
		
	public void addStudent(Student student) {
		if(studentNum<100)
		{
			students[studentNum++]=student;
			
		}
		else
			System.out.print("This student doesnt qualify");
	}
	public int getNumOfStudents()
	{
		return studentNum;
	}
	public int getNumOfTeachers()
	{
		return teacherNum;
	}
	
	public double calculateMonthlyProfit() {
		double totalFee=0.0;
		double totalSalary=0.0;
		for(int i=0;i<studentNum;i++)
			totalFee+=students[i].getFees();
		for(int j=0;j<teacherNum;j++)
			totalSalary+=teachers[j].getSalary();
		return totalFee-totalSalary;
	}
}
