package apps.ucu.task2;

import lombok.Builder;
import lombok.Getter;
import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Builder
@Data
public class Client {
    private static AtomicInteger counter = new AtomicInteger();

    private final int id = counter.incrementAndGet();
    private String name;
    private int age;
    private String sex;

}
