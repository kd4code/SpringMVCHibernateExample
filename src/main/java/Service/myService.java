package Service;

import java.util.List;

import Entity.Result;

public interface myService {
	
  public void saveResult(Result rt);
  public void deleteResult(int roll);
  public void updateResult(Result r);
  public Result getResult(int roll);
  public List<Result> getAllResult();

}
