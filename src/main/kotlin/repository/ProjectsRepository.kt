package repository

import Entity.ProjectEntity
import org.springframework.data.repository.CrudRepository

interface ProjectsRepository: CrudRepository<ProjectEntity,Int> {

}