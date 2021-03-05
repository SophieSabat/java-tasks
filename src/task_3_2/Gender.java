package task_3_2;

public enum Gender {
    WOMAN("female"),
    MAN("male");

    String gender;

    Gender() {
    }

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "gender='" + gender + '\'' +
                "} " + super.toString();
    }
}
