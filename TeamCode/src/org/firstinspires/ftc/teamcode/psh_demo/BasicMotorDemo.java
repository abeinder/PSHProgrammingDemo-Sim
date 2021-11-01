package org.firstinspires.ftc.teamcode.psh_demo;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Test Motor",group="Test")
public class BasicMotorDemo extends OpMode {
    private DcMotor motor;

    public void init() {
        motor = hardwareMap.get(DcMotor.class, "left_motor");
        motor.setDirection(DcMotor.Direction.FORWARD);
    }

    public void loop() {
        float yPos = gamepad1.left_stick_y;
        motor.setPower(yPos);

        int motorPosition = motor.getCurrentPosition();

        telemetry.addData("Position", motorPosition);
        telemetry.addData("Stick Position", String.format("%.2g", yPos));
        telemetry.update();
    }
}
