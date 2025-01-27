package repository

import entity.ProjectEntity
import org.springframework.data.repository.CrudRepository

interface ProjectsRepository: CrudRepository<ProjectEntity,Int> {

}