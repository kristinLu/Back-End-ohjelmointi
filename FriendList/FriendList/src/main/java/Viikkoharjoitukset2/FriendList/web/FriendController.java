package Viikkoharjoitukset2.FriendList.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {
	ArrayList<String> friends = new ArrayList<>();
	
	@GetMapping("/index")
	public String showFriends(Model model) {
		model.addAttribute("friends", friends);
		return "friendList";
	}
	
	@PostMapping("/index")
	public String addFriend(@RequestParam(name="friend") String friend, Model model) {
		model.addAttribute("friends", friends.add(friend));
		return "redirect:/index";
	}

}
