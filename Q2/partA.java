public class SignedText{
    private String name;
    private String lname;
    public SignedText(String n, String ln){
        name = n;
        lname = ln;
    }
    public String getSignature(){
        if(name.length() == 0){
            return lname;
        }
        return name.substring(0,1) + "-" + lname;
    }
    public String addSignature(String str){
        if(str.indexOf(getSignature()) == -1){
            return str + getSignature();
        }
        if(str.indexOf(getSignature()) == 0){
            return str.substring(getSignature().length()) + getSignature();
        }
        return str;
    }


}
