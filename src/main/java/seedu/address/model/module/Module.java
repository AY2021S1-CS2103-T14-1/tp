package seedu.address.model.module;

import static seedu.address.commons.core.Messages.MESSAGE_INSTRUCTOR_DOES_NOT_EXIST;
import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.person.Person;

/**
 * Represents a module in FaculType.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Module {

    // Identity fields
    private final ModuleCode moduleCode;

    // Data fields
    private final ModuleName moduleName;
    private final Set<Person> instructors = new HashSet<>();

    /**
     * Every field must be present and not null.
     */
    public Module(ModuleCode moduleCode, ModuleName moduleName) {
        requireAllNonNull(moduleCode, moduleName);
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
    }

    /**
     * Every field must be present and not null.
     */
    public Module(ModuleCode moduleCode, ModuleName moduleName, Set<Person> instructors) {
        requireAllNonNull(moduleCode, moduleName, instructors);
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.instructors.addAll(instructors);
    }

    public ModuleCode getModuleCode() {
        return moduleCode;
    }

    public ModuleName getModuleName() {
        return moduleName;
    }

    public Set<Person> getInstructors() {
        return Collections.unmodifiableSet(instructors);
    }

    public void assignInstructor(Person instructor) {
        this.instructors.add(instructor);
    }

    /**
     * Unassigns {@code instructor} from this module.
     * @param instructor person in the filtered person list to be unassigned
     * @throws CommandException if the instructor does not exist in the instructor list
     */
    public void unassignInstructor(Person instructor) throws CommandException {
        if (!this.instructors.contains(instructor)) {
            throw new CommandException(MESSAGE_INSTRUCTOR_DOES_NOT_EXIST);
        }

        this.instructors.remove(instructor);
    }

    /**
     * Returns true if both modules have the same code.
     */
    public boolean isSameModule(Module otherModule) {
        if (otherModule == this) {
            return true;
        }

        return otherModule != null
                && otherModule.moduleCode.equals(moduleCode);
    }

    /**
     * Returns true if module has the specified module code.
     */
    public boolean hasModuleCode(ModuleCode moduleCodeToCheck) {
        return moduleCodeToCheck != null
                && moduleCodeToCheck.equals(moduleCode);
    }

    /**
     * Returns true if both modules have the same identity and data fields.
     * This defines a stronger notion of equality between two modules.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof Module)) {
            return false;
        }

        Module m = (Module) other;
        return m.moduleCode.equals(moduleCode)
                && m.moduleName.equals(moduleName)
                && m.instructors.equals(instructors);

    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(moduleCode);
    }

    @Override
    public String toString() {
        return moduleCode + " " + moduleName;
    }

}
