package device.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import device.entity.DeviceEntity;

public abstract class DeviceRepo implements JpaRepository<DeviceEntity, Integer> {

}
