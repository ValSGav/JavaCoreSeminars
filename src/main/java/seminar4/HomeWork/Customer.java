package seminar4.HomeWork;

import lombok.Data;

import java.util.Calendar;
import java.util.Objects;

@Data
public class Customer {
    private final String name;
    private Gender gender;
    private Calendar birthDay;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name);
    }

    public String getBirthDayMonth(){
        return String.format("%d.%d"
                , this.birthDay.get(Calendar.DAY_OF_MONTH)
                , this.birthDay.get(Calendar.MONTH));
    }

}
