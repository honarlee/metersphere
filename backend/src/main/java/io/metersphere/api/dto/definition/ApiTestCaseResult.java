package io.metersphere.api.dto.definition;

import io.metersphere.base.domain.ApiTestCaseWithBLOBs;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ApiTestCaseResult extends ApiTestCaseWithBLOBs {
    private String projectName;
    private String createUser;
    private String updateUser;
    private String execResult;
    private Long execTime;
    private boolean active = false;
}
