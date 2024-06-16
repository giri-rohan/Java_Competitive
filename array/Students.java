package array;

public class Students {
	int rollno;
	int marks;
	String name;
	public static void main(String[] args) {
		Students s1=new Students();
		s1.rollno=1;
		s1.marks=88;
		s1.name="rohan";
		Students s2=new Students();
		s2.rollno=2;
		s2.marks=87;
		s2.name="sourav";
		Students s3= new Students();
		s3.rollno=3;
		s3.marks=80;
		s3.name="rahul";
		Students st[]=new Students[3];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i].name);
		}
	}

}
