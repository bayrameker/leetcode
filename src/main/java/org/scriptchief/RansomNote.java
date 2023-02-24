package org.scriptchief;

public class RansomNote {
    public boolean getRansomNoteWorst(String ransomNote, String magazine){
        StringBuilder strRansomNote = new StringBuilder(ransomNote);
        StringBuilder strMagazine = new StringBuilder(magazine);
        int sayac = 0;

            for(int i = 0; i<ransomNote.length(); i++) {
                for (int j = 0; j < strMagazine.length(); j++) {
                    if(ransomNote.charAt(i) == strMagazine.charAt(j)){
                        System.out.println(strMagazine);
                        strMagazine.deleteCharAt(j);
                        sayac++;
                    }
                }
            }

            return ransomNote.length() == sayac;

    }

    public boolean getRansomNoteBetter(String ransomNote, String magazine){
        int[] tracker = new int[26];

        for (char mag : magazine.toCharArray()) {
            tracker[mag - 'a']++;
        }

        for (char rN : ransomNote.toCharArray()) {
            int temp = tracker[rN - 'a'];
            if (temp > 0) {tracker[rN - 'a']--;}
            else {return false;}
        }

        return true;
    }
}
