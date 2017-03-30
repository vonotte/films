package com.vonotte.service.evaluation;

import com.vonotte.dto.evaluation.EvaluationDTO;
import com.vonotte.dto.evaluation.EvaluationPostDTO;

public interface EvaluationService {
	
	EvaluationDTO create(EvaluationPostDTO e);

}
