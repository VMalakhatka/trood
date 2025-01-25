package controller

import dto.ProjectDto
import org.springframework.web.bind.annotation.*
import service.ProjectService

@RestController
@RequestMapping("/projects")
class Controller(
        private val projectService: ProjectService,
) {
    @GetMapping
    fun getAll(): List<ProjectDto> = projectService.getAll()


    @GetMapping("/{id}")
    fun getById(@PathVariable("id") id: Int): ProjectDto =
            projectService.getById(id)

    @PostMapping
    fun create(@RequestBody dto: ProjectDto): Int = projectService.create(dto)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody dto: ProjectDto) {
        projectService.update(id, dto)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Int) {
        projectService.delete(id)
    }

}