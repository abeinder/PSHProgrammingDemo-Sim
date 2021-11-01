package org.firstinspires.ftc.teamcode.psh_demo;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name="Tank Drive",group="PSH Demo")
public class TankDriveDemo extends OpMode {
    private DcMotor leftMotor;
    private DcMotor rightMotor;

    /**
     * Initialize the hardware configuration of the robot.
     * This method is run whenever you hit "init" on the robot.
     */
    public void init() {
        // Within the hardware configuration of the robot, there must be a motor
        //     labeled "left_motor"
        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        rightMotor = hardwareMap.get(DcMotor.class, "right_motor");

        leftMotor.setDirection(DcMotor.Direction.FORWARD);
        rightMotor.setDirection(DcMotor.Direction.FORWARD);
    }

    public void loop() {
        float yPosLeft = gamepad1.left_stick_y;
        float yPosRight = gamepad1.right_stick_y;

        leftMotor.setPower(yPosLeft);
        rightMotor.setPower(yPosRight);

        int leftMotorPosition = leftMotor.getCurrentPosition();
        int rightMotorPosition = rightMotor.getCurrentPosition();

        telemetry.addData("Left Position", leftMotorPosition);
        telemetry.addData("Right Position", rightMotorPosition);
        telemetry.update();
    }
}
