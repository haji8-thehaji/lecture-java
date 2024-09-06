public class Korean extends People implements VisaCheck {
    String residentNumber;

    public Korean(String residentNumber, String name, String gender, String nation) {
        super(name, gender, nation);
        this.residentNumber = residentNumber;
    }

    @Override
    public Integer VisaCheck() {
        if( residentNumber.length() == 13)return 1;
        return 0;
    }
}
