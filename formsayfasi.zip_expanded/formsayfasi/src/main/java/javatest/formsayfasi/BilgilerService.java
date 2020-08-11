package javatest.formsayfasi;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BilgilerService {
@Autowired
	private BilgilerRepository repo;
    
	public void save(Bilgiler bilgiler)
	{
		repo.save(bilgiler);
		
	}
}
