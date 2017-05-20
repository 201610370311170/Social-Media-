public class data implements Comparable <data>{
    
    String nama;
    String gender;
    String alamat;
    String email;
    
    public data(String nama, String gender, String alamat, String email){
        setNama(nama);
        setGender(gender);
        setAlamat(alamat);
        setEmail(email);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public int compareTo(data o) {
        if(nama.compareTo(o.getNama()) < 0 ) return -1;
        if(nama.compareTo(o.getNama()) == 0 ) return 0;
        return 1;
    }
}
