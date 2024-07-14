package com.ithaka.ufabc.agentcam.rest;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ithaka.ufabc.agentcam.CamCapture;

@RestController(value = "/")
public class GetImageCam {
	
	@GetMapping("{idCam}")
    public List<String> findById(@PathVariable("idCam") Integer idCam) {
    	
		CamCapture camCapture = new CamCapture();
		List<String> images = camCapture.captureFrame(idCam, 10);
    	
        return images;
    }

}
