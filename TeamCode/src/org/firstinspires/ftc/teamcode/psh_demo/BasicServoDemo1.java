package org.firstinspires.ftc.teamcode.psh_demo;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Servo Demo 1",group="PSH Demo")
public class BasicServoDemo1 extends OpMode {

    private Servo backServo = null;

    public void init() {
        backServo = hardwareMap.servo.get("back_servo");
    }

    public void loop() {
        float yPos = gamepad1.left_stick_y;
        backServo.setPosition(0.5 - 0.5* gamepad1.left_stick_y);

        telemetry.addData("Stick Position", String.format("%.2g", yPos));
        telemetry.update();
    }
}
