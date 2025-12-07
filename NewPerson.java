public class NewPerson {
    protected String fullName;
    protected int registrationNumber;
    protected String email;

    /**
     * Constructor
     * @param fn Full name
     * @param rn Registration Number
     * @param email Email ID
     */

    public NewPerson(String fn, int rn, String email) {
        this.fullName = fn;
        this.registrationNumber = rn;
        this.email = email;

    }
    //no arguments constructor for Student constructor in student class
    public NewPerson(){

    }

    /**
     * getter method to have access towards protected variable fullName
     * @return returns the full name that is given
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * setter method for fullName
     * @param fn
     */

    public void setFullName(String fn) {this.fullName = fn;}

    /**
     * getter method to get access towards protected variable registrationNumber
     * @return returns registration number given
     */
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * setter method for registration number
     * @param rn
     */


    public void setRegistrationNumber(int rn) {this.registrationNumber = rn;}

    /**
     * getter method to have access towards protected variable email
     * @return returns email id that is given
     */
    public String getEmail() {
        return email;
    }

    /**
     * setter method for email
     * @param email
     */


    public void setEmail(String email) {this.email = email;}

    public String toString() {
        return "Student: " + fullName + ", Registration Number: " + registrationNumber + ", Email: " + email;
    }
}
