package org.desktop.mainservice.util.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.desktop.mainservice.domain.dto.binding.ChangeStatusBinding;
import org.desktop.mainservice.domain.enums.Status;

public class ConsistentStateValidator
        implements ConstraintValidator<ConsistentState, ChangeStatusBinding> {

    @Override
    public boolean isValid(ChangeStatusBinding dto, ConstraintValidatorContext context) {
        if (dto == null) {
            return false;
        }
        if (dto.getStatus() == Status.delayed){
            return dto.getDelayMinutes() != null && dto.getDelayMinutes() > 0;
        }
        return true;
    }
}
