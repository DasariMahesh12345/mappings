package com.practice.ehr.patient.search.add.vitals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.practice.ehr.EHR.Login;

public class PatientSearchAndVitalsAdd extends Login {

	@Test
	public void PatientSearch() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search patients by name (>3 chars) ...']"))
				.sendKeys("Rajesh, Test", Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"patientsListDD\"]/ul/label/span[1]")).click();
	}

	@Test
	public void vitalsAdd() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"vital_card-header\"]/div/div[4]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='bp1Upper']")).sendKeys("120");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='bp1Lower']")).sendKeys("80");

		Thread.sleep(2000);
		Select measure = new Select(driver.findElement(By.xpath("//select[@formcontrolname='bp1measure']")));
		measure.selectByVisibleText("manual");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='bp1Comment']")).sendKeys("Normal BP");
		Thread.sleep(2000);
		Select siteOption = new Select(driver.findElement(By.xpath(" //select[@formcontrolname='bp1SiteId']")));
		siteOption.selectByVisibleText(" Left Arm");
		Thread.sleep(2000);

		Select cuffOption = new Select(driver.findElement(By.xpath("//select[@formcontrolname='bp1CuffId']")));
		cuffOption.selectByVisibleText(" Regular Cuff");

		Thread.sleep(2000);
		Select positonOption = new Select(driver.findElement(By.xpath("//select[@formcontrolname='bp1PositionId']")));
		positonOption.selectByVisibleText("Sitting");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='temp1']")).sendKeys("98");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='height']")).sendKeys("5.9");

		Thread.sleep(2000);
		Select heightMeasurecminc = new Select(
				driver.findElement(By.xpath("//select[@formcontrolname='heightUOMId']")));
		heightMeasurecminc.selectByVisibleText("cm (ucumId: 130)");
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@formcontrolname='weight']")).sendKeys("50");

		Thread.sleep(2000);
		Select weightMeasurecminc = new Select(
				driver.findElement(By.xpath("//select[@formcontrolname='weightUOMId']")));
		weightMeasurecminc.selectByVisibleText("Kg (ucumId: 153)");
		Thread.sleep(2000);
		driver.findElement(By.id("heartRate")).sendKeys("72");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@formcontrolname='bloodSugar']")).sendKeys("150");

		Thread.sleep(2000);
		Select painSevirity = new Select(driver.findElement(By.xpath("//select[@formcontrolname='verbalNumRating']")));
		painSevirity.selectByVisibleText("5");
		Thread.sleep(2000);

		Select GlobalImpressionChange = new Select(
				driver.findElement(By.xpath("//select[@formcontrolname='globalImpressionOfChangeId']")));
		GlobalImpressionChange.selectByVisibleText("No change");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@id='saveBtn']")).click();

	}

}
