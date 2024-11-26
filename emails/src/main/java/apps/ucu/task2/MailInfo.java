package apps.ucu.task2;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MailInfo {
    private final Client client;
    private final MailStrategy mailStrategy;
}
