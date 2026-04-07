package org.desktop.mainservice.util.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.desktop.mainservice.domain.dto.binding.ChangeStatusBinding;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = { ConsistentStateValidator.class })
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface ConsistentState {

    String message() default "Объект находится в некорректном состоянии";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
