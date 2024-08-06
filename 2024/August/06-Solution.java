//its naive appraoch....
// class Solution {
//     public boolean isValid(String str) {
       
//         String[] parts=str.split("\\.");
//         if(parts.length!=4){
//             return false;
//         }
//         for(String part:parts){
//             if(!isNumeric(part)|| !isValidPart(part)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     private boolean isNumeric(String str){
//         try{
//             Integer.parseInt(str);
//             return true;
//         } 
//         catch(NumberFormatException e){
//             return false;
//         }
//     }
//     private boolean isValidPart(String part){
//         int num=Integer.parseInt(part);
//         return(num>=0&&num<=255)&&(part.equals("0")|| !part.startsWith("0"));
//     }
// }
class Solution {
    public boolean isValid(String str) {
        String[] parts=str.split("\\.");
        
        if(parts.length!=4){
            return false;
        }
        for(String part:parts){
            if(!isValidPart(part)){
                return false;
            }
        }
        return true;
    }
    private boolean isValidPart(String part){
        if(part.isEmpty()|| !part.chars().allMatch(Character::isDigit)){
            return false;
        }
        int num=Integer.parseInt(part);
        return (num>=0&&num<=255) &&(part.equals("0")|| !part.startsWith("0"));
    }
}
