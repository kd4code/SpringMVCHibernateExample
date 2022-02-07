package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DAO.myDao;
import Entity.Result;

@Service
public class myServiceImpl implements myService {
    @Autowired
	myDao md;
	
	@Override
	public void saveResult(Result rt) {  		
		md.saveResult(rt);
	}

	@Override
	public void deleteResult(int roll) {
		md.deleteResult(roll);
		
	}

	@Override
	public void updateResult(Result r) {
		md.updateResult(r);
		
	}

	@Override
	public Result getResult(int roll) {
		return md.getResult(roll);
		
	}

	@Override
	public List<Result> getAllResult() {
		return md.getAllResult();
	}

}
