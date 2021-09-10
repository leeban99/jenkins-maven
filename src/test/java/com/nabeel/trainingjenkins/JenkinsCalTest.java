package com.nabeel.trainingjenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import com.nabeel.training.jenkins.JenkinsCalculator;

public class JenkinsCalTest {

	@Test
	public void test() {
		JenkinsCalculator JC = new JenkinsCalculator();
		assertEquals(10, JC.addNumbers(5, 5));		
		
	}

}
