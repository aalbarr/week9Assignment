package projects.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();

	public Project addProject(Project project) {// method to call DAO class to insert row
		return projectDao.insertProject(project);
	}

	public List<Project> fetchAllProjects() {
		return projectDao.fetchAllProjects();
	}

	// method that calls the dao to retrieve a singel project
	// with all details will throw excetpion if project w id
	// does not exist
	public Project fetchProjectById(Integer projectId) {
		return projectDao.fetchProjectById(projectId).orElseThrow(() -> new NoSuchElementException("Project with project ID=" + projectId + " does not exist."));
				

	}
}
