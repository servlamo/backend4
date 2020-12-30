package com.farzoom.lime.adapter.cbs.service.integration.es.repositories;

import com.farzoom.common.persistence.es.repositories.base.TypedEsRepository;
import com.farzoom.lime.adapter.cbs.service.integration.es.model.Task;

public class TaskRepository extends TypedEsRepository<Task> {

    public TaskRepository(String esBaseUrl) {
        super(esBaseUrl, "bpm", "task");
    }

    @Override
    public Class<Task> getXType() {
        return Task.class;
    }
}
