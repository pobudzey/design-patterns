package builder;

import java.util.Date;

public class User {

    private final String firstName;
    private final String lastName;
    private final Date birth;
    private final String address;
    private final String phone;

    public User(String firstName, String lastName, Date birth, String address, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public static class UserBuilder {

        // Required attributes
        private final String firstName;
        private final String lastName;
        // Optional attributes
        private Date birth;
        private String address;
        private String phone;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder withBirth(Date birth) {
            this.birth = birth;
            return this;
        }

        public UserBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(firstName, lastName, birth, address, phone);
        }
    }
}
