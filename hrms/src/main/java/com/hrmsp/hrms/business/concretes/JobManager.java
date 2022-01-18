package com.hrmsp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrmsp.hrms.business.abstracts.JobService;
import com.hrmsp.hrms.dataAccess.abstracts.JobDao;
import com.hrmsp.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

}
