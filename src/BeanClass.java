public class BeanClass {
   
    private int Id;
    private String NameOfDeptt;
    private String Course;
    private String check;

    public String getCheck() {
        return check;
    }

    public void setCheck(String check) {
        this.check = check;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNameOfDeptt() {
        return NameOfDeptt;
    }

    public void setNameOfDeptt(String NameOfDeptt) {
        this.NameOfDeptt = NameOfDeptt;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }
    
    
    public String toString(){
        
        return NameOfDeptt;
    }
}
