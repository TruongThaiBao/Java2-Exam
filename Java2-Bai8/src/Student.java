public class Student extends Person implements Comparable<Student>{
    private float score1, score2;

    public Student() {
        //Constructor mặc định
    }

    public Student(String name, String address, float score1, float score2) {
        super(name, address);
        this.score1 = score1;
        this.score2 = score2;
    }

    public float getScore1() {
        return score1;
    }

    public float getScore2() {
        return score2;
    }

    public void setScore1(float score1) {
        this.score1 = score1;
    }

    public void setScore2(float score2) {
        this.score2 = score2;
    }

    //Tính điểm trung bình
    public double calcAverageScore(){
        return (score1 + score2)/2;
    }

    //Đánh giá
    public String danhGia(){
        if (calcAverageScore() >= 5){
            return "Đậu";
        }
        return "Rớt";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMôn 1 :" + score1 +
                "\nMôn 2 :" + score2 +
                "\nĐiểm trung bình :" + calcAverageScore() +
                "\n--------------------------";
    }

    @Override
    public int compareTo(Student student){
        return this.getName().compareTo(student.getName());
    }
}
