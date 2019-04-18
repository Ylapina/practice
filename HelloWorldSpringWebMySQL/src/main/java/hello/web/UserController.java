package hello.web;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Optional;

import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import hello.business.User;
import hello.business.UserRepository;
import hello.util.JsonResponse;

@Controller
@RequestMapping(path = "/users")
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
    //get all users
	@GetMapping(path = "/")
	public @ResponseBody JsonResponse getAllUsers() {
		JsonResponse jr = null;
		try {
		jr= JsonResponse.getInstance(userRepo.findAll());
		
		}catch (Exception e) {
			jr=JsonResponse.getInstance(e);
		}
		return jr;
	}
	 //get users paginated
		@GetMapping(path = "")
		public @ResponseBody JsonResponse getUsers(@RequestParam int start,@RequestParam int limit) {
			JsonResponse jr = null;
			try {
			jr= JsonResponse.getInstance(userRepo.findAll( PageRequest.of(start,limit)));
			
			}catch (Exception e) {
				jr=JsonResponse.getInstance(e);
			}
			return jr;
		}
    //get method using request parameter
	//@GetMapping("/get")
	//public @ResponseBody Optional<User> getUserById(@RequestParam int id) {
		//Optional<User> u = userRepo.findById(id);
		//return u;
		//return getUser(id);
	//}
	//get method using path variable
	
	@GetMapping("/{id}")
	public @ResponseBody JsonResponse getUser(@PathVariable int id) {
		JsonResponse jr=null;
		try {
		Optional<User> u = userRepo.findById(id);
		if(u.isPresent()) {
			//good call to DB return a valid user
			jr=JsonResponse.getInstance(u);
		}
		else {
			jr=JsonResponse.getInstance(
					new Exception("No user found for id= "+id));
		}
			
		}
		catch(Exception e) {
			jr = JsonResponse.getInstance(e);
	}
		return jr;
	}
	//add a user
	@PostMapping(path = "/")
	public @ResponseBody JsonResponse addNewUser(@RequestBody User u) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		//return userRepo.save(user);

		    return saveUser(u);
	}


	//update a user
	@PutMapping("/{id}")
	public @ResponseBody JsonResponse updateUser(@PathVariable int id, @RequestBody User u) {
		//should be checking to see if user exist first?
		return JsonResponse.getInstance(saveUser(u));
		
		
	}
	private @ResponseBody JsonResponse saveUser(User u) {
		JsonResponse jr = null;
		try {
			userRepo.save(u);
			JsonResponse.getInstance(u);
			
		}
		catch (DataIntegrityViolationException dve) {
			//jr = JsonResponse.getInstance(dve);
			
			jr=JsonResponse.getInstance(dve);
			
		}
		return jr;
	}
	
	
	@DeleteMapping("/{id}")
	public @ResponseBody JsonResponse removeUser(@PathVariable int id) {
		JsonResponse jr = null;
		Optional<User> u = userRepo.findById(id);
		
		if(u.isPresent()) {
			userRepo.deleteById(id);
		jr=JsonResponse.getInstance(u);
	}
	else  {
	jr =JsonResponse.getInstance( "delete unsuccessful, no user id= " + id);
	}

		return jr; 
		
	}
	
	@PostMapping("/getByEmail")
	public @ResponseBody JsonResponse getUserByEmail(@RequestBody User user) {
		return JsonResponse.getInstance(userRepo.findByEmail(user.getEmail()));
		
	}
	
	
	
	
	
}