package webcrawler.shopping.swipe.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExpTag {
    private String id;
    private String name;
    private Float[] embedding;
}
