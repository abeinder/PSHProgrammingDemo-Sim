package org.firstinspires.ftc.teamcode.psh_demo;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
/*
 * This is an example LinearOpMode that shows how to use an ultrasonic distance sensor (UDS).
 * It assumes that the UDS sensor is configured with a name of "distance_sensor".
 *
 * Use Android Studio to Copy this Class, and Paste it into your team's code folder with a new name.
 */
@TeleOp(name = "Distance Sensor", group = "PSH Demo")
public class BasicSensorDemo extends LinearOpMode {

    @Override
    public void runOpMode() {

        // get a reference to our Distance Sensor object.
        //uses new method .get to store a certain parameter and take an DistanceSensor
        //instantiates new DistanceSensor
        DistanceSensor distanceSensor = hardwareMap.get(DistanceSensor.class, "sensor_color_distance");

        // wait for the start button to be pressed.
        waitForStart();

        // while the op mode is active, loop and read the distances to the
        // Note we use opModeIsActive() as our loop condition because it is an interruptible method.
        while (opModeIsActive()) {

            // send the info back to driver station using telemetry function.
            telemetry.addData("Distance",    distanceSensor.getDistance(DistanceUnit.CM));
            // update the telemetry on the screen
            telemetry.update();
        }
    }
}


