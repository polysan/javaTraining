package chapter12.samplePolisy;

import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Policy;
import java.security.ProtectionDomain;

@SuppressWarnings("removal")
public class SamplePolisy extends Policy {

	private final PermissionCollection permissions;

	public SamplePolisy(PermissionCollection permissions) {
		this.permissions = permissions;
	}

	@Override
	public boolean implies(ProtectionDomain domaijn, Permission permission) {
		return permissions.implies(permission);
	}
}
