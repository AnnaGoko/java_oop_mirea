class Author {
  private String name;
  private String email;
  private char gender;

  public Author(String name, String email, char gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public char getGender() {
    return gender;
  }
  

  public String toString() {
    String genderString;
    if (gender == 'M') {
      genderString = "(m)";
    } else if (gender == 'F') {
      genderString = "(f)";
    } else {
      genderString = "(u)";
    }
    return name + " " + genderString + " at " + email;
  }
}

// class TestAuthor {
//   public static void main(String[] args) {
//     Author author1 = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'M');
//     Author author2 = new Author("Sue Grant", "suGrant@somewhere.com", 'F');
//     System.out.println(author1);
//     System.out.println(author2);
//     author1.setEmail("newEmail@somewhere.com");
//     System.out.println(author1);
//   }
// }